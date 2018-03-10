package com.hamza.hotelsoffersapp.offer.model.implementation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "persona",
    "userId"
})
public class UserInfoDto {

    @JsonProperty("persona")
    private PersonaDto persona;
    @JsonProperty("userId")
    private String userId;

    @JsonProperty("persona")
    public PersonaDto getPersona() {
        return persona;
    }

    @JsonProperty("persona")
    public void setPersona(PersonaDto persona) {
        this.persona = persona;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
