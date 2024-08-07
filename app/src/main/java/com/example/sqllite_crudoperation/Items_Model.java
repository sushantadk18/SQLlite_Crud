package com.example.sqllite_crudoperation;

public class Items_Model {
    private String id;
    private String name;
    private  String age;
    private String msg;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String toString(){
        return "Item{"+
                "id"+id+
                "name" +name+
                "age"+age+
                "msg"+msg+"}";

    }




}
