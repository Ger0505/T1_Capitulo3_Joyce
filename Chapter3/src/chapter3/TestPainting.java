/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class TestPainting {
    public static Painting inicializePaint(){
        Painting picture = new Painting();
        Scanner scanner = new Scanner(System.in);
        picture.setTile(scanner.nextLine());
        picture.setArtist(scanner.nextLine());
        picture.setMedium(scanner.nextLine());
        picture.setPrice(scanner.nextDouble());
        return picture;
    }
}
