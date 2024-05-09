package com.lucentlearn.payas.app.StudentCRUD.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminDetailsRequestModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}