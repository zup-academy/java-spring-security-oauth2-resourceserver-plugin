package {{inputs.application_package}}.samples.security.books;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.jwt;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrlPattern;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc(printOnlyOnFailure = false)
class NewBookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    @DisplayName("should create a new book")
    public void t1() throws Exception {
        // scenario
        NewBookRequest request = new NewBookRequest(
                "Desbravando SOLIDO",
                "Práticas avançadas para códigos de qualidade em Java moderno",
                "978-0-4703-2225-3",
                LocalDate.now().minusYears(1)
        );

        // action and validation
        mockMvc.perform(post("/api/v1/books")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request))
                        .header(HttpHeaders.ACCEPT_LANGUAGE, "en")
                        .with(jwt()
                            .authorities(new SimpleGrantedAuthority("SCOPE_books:write"))
                        ))
                .andExpect(status().isCreated())
                .andExpect(redirectedUrlPattern("**/api/v1/books/*"))
        ;
    }

    @Test
    @DisplayName("should not create a new book when token is not sent")
    public void t2() throws Exception {
        // scenario
        NewBookRequest request = new NewBookRequest(
                "Desbravando SOLIDO",
                "Práticas avançadas para códigos de qualidade em Java moderno",
                "978-0-4703-2225-3",
                LocalDate.now().minusYears(1)
        );

        // action and validation
        mockMvc.perform(post("/api/v1/books")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request))
                        .header(HttpHeaders.ACCEPT_LANGUAGE, "en"))
                .andExpect(status().isUnauthorized()) // 401-Unauthorized
        ;
    }

    @Test
    @DisplayName("should not create a new book when token has not the properly scope")
    public void t3() throws Exception {
        // scenario
        NewBookRequest request = new NewBookRequest(
                "Desbravando SOLIDO",
                "Práticas avançadas para códigos de qualidade em Java moderno",
                "978-0-4703-2225-3",
                LocalDate.now().minusYears(1)
        );

        // action and validation
        mockMvc.perform(post("/api/v1/books")
                        .contentType(APPLICATION_JSON)
                        .content(toJson(request))
                        .header(HttpHeaders.ACCEPT_LANGUAGE, "en")
                        .with(jwt()
                            .authorities(new SimpleGrantedAuthority("SCOPE_books:invalid"))
                        ))
                .andExpect(status().isForbidden()) // 403-Forbidden
        ;
    }

    private String toJson(Object payload) throws JsonProcessingException {
        return mapper.writeValueAsString(payload);
    }

}