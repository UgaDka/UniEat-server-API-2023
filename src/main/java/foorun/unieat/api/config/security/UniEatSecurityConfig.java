package foorun.unieat.api.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@RequiredArgsConstructor
public class UniEatSecurityConfig {
    /* http(Hyper Text Transfer Protocol) 설정 */
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.httpBasic()                                        /* http */
            .disable()                                          /* 비활성 */
        ;

        http.csrf()                                             /* Cross Site Request Forgery */
            .disable()
        ;

        http.cors()                                             /* Cross-Origin Resource Sharing */
            .disable()
        ;

        http.formLogin()                                        /* form login 처리 */
            .disable()                                          /* 비활성 */
        ;

        http.logout()                                           /* logout 처리 */
            .logoutUrl("/member/sign-out")                      /* logout URL */
            .invalidateHttpSession(true)                        /* 세션 무효화 */
            .deleteCookies("JSESSIONID")    /* 쿠키 제거 */
        ;

        http.exceptionHandling()                                /* Exception 처리 */
        ;

        http.authorizeHttpRequests()                            /* 요청에 대한 검사 처리 */
            .antMatchers("/member/sign-*/**")       /* URL 패턴 */
            .permitAll()                                        /* 인가 */
        ;

        return http.build();
    }

    /* 정적 자원 등의 Page Ignore */
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring()
        ;
    }
}