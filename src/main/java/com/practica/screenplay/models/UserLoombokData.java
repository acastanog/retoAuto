package com.practica.screenplay.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserLoombokData {
    @Getter @Setter
    String user;
    @Getter @Setter
    String password;

    public static List<UserLoombokData> setData(DataTable table){
        List<UserLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, UserLoombokData.class));
        }
        return data;
    }
}
