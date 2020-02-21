package com.example.firstdatabinding;

import androidx.databinding.ObservableField;

public class RegistrationModel {

    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<Integer> age = new ObservableField<>();
    public ObservableField<String> address = new ObservableField<>();

    public ObservableField<Boolean> getIsMinor() {
        return isMinor;
    }

    public ObservableField<Boolean> isMinor = new ObservableField<>();

    public RegistrationModel(String name, Integer age, String address, Boolean isMinor) {
        this.name.set(name);
        this.age.set(age);
        this.address.set(address);
        this.isMinor.set(isMinor);
    }


    /*private RegistrationModel(*//*ObservableField<String>*//*String  name, *//*ObservableField<Integer> *//*int age, *//*ObservableField<String>*//* String address, boolean*//*bservableField<Boolean>*//* isMinor) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isMinor = isMinor;
    }*/

    /*public static RegistrationModel createRegistrationModel(ObservableField<String> name, ObservableField<Integer> age, ObservableField<String> address, ObservableField<Boolean> isMinor) {
        return new RegistrationModel(name, age, address, isMinor);
    }*/
}
