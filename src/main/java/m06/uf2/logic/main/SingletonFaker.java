/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf2.logic.main;

import com.github.javafaker.Faker;

/**
 *
 * @author manel
 */
public class SingletonFaker {

    private static SingletonFaker instancia = null;
    private Faker faker = null;

    private SingletonFaker() {
        InitFaker();
    }

    public static SingletonFaker getInstance()
    {
        if (instancia == null)
            instancia = new SingletonFaker();

        return instancia;
    }

    private void InitFaker() {
            faker = new Faker();
    }

    public Faker getFaker() {
       return faker;
    }        
}
