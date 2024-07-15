package com.practica.screenplay.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RegistroCandidatoLoombokData {

    @Getter @Setter
    String firstName;
    @Getter @Setter
    String middleName;
    @Getter @Setter
    String lastName;
    @Getter @Setter
    String email;

    public static List<RegistroCandidatoLoombokData> setData(DataTable table){
        List<RegistroCandidatoLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, RegistroCandidatoLoombokData.class));
        }
        return data;
    }
}
