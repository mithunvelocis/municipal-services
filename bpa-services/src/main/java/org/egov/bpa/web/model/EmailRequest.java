package org.egov.bpa.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString

public class EmailRequest {
    private String email;
    private String subject;
    private String body;
    @JsonProperty("isHTML")
    private boolean isHTML;

    public Email toDomain() {
        return Email.builder()
				.toAddress(email)
				.subject(subject)
				.body(body)
				.html(isHTML)
				.build();
    }

	public EmailRequest(String key, String customizedMsg) {
		// TODO Auto-generated constructor stub
		this.email=key;
		this.body=customizedMsg;		
	}
}
