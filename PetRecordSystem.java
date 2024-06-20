package petrecordsystem;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import week17.tutorial.ArrayListDemo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PetRecordSystem 
{

    JTextField meowTF;
    JTextField nameTF;
    JTextField meowAgeTF;
    JTextField detailTF;
    JFrame pet;

    JTextField bhauTF;
    JTextField bhauNameTF;
    JTextField shepherdTF;
    JTextField holderTF;
    JTextField dateTF;

    JTextField extraPetTF;
    JTextField newdateTF;
    JTextField domesticTF;

    ArrayList<Animal> petList = new ArrayList<Animal>();

    public PetRecordSystem() {
        pet = new JFrame();
        pet.setLayout(null);
        pet.setBounds(200, 100, 900, 600);
        pet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Pet Record System");
        label.setBounds(300, 20, 300, 40);
        Font font = new Font("Josefin sans", Font.BOLD, 30);
        label.setFont(font);
        pet.add(label);

        JLabel meow = new JLabel("Cat Info");
        meow.setBounds(80, 70, 100, 20);
        pet.add(meow);

        JLabel meowId = new JLabel("Pet Id");
        meowId.setBounds(20, 100, 100, 20);
        pet.add(meowId);

        meowTF = new JTextField();
        meowTF.setBounds(80, 100, 100, 20);
        pet.add(meowTF);

        JLabel meowName = new JLabel("Name");
        meowName.setBounds(20, 140, 100, 20);
        pet.add(meowName);

        nameTF = new JTextField();
        nameTF.setBounds(80, 140, 100, 20);
        pet.add(nameTF);

        JLabel meowAge = new JLabel("Age");
        meowAge.setBounds(20, 180, 100, 20);
        pet.add(meowAge);

        meowAgeTF = new JTextField();
        meowAgeTF.setBounds(80, 180, 100, 20);
        pet.add(meowAgeTF);

        JLabel detail = new JLabel("Owner");
        detail.setBounds(20, 220, 100, 20);
        pet.add(detail);

        detailTF = new JTextField();
        detailTF.setBounds(80, 220, 100, 20);
        pet.add(detailTF);

        JButton button1 = new JButton("Add Cat");
        button1.setBounds(60, 260, 120, 30);
        pet.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addCat();
            }
        });

        JLabel bhau = new JLabel("Dog Info");
        bhau.setBounds(400, 70, 100, 20);
        pet.add(bhau);

        JLabel bhauId = new JLabel("Pet Id: ");
        bhauId.setBounds(300, 100, 100, 20);
        pet.add(bhauId);

        bhauTF = new JTextField();
        bhauTF.setBounds(420, 100, 100, 20);
        pet.add(bhauTF);

        JLabel bhauName = new JLabel("Name: ");
        bhauName.setBounds(300, 140, 100, 20);
        pet.add(bhauName);

        bhauNameTF = new JTextField();
        bhauNameTF.setBounds(420, 140, 100, 20);
        pet.add(bhauNameTF);

        JLabel shepherd = new JLabel("Breed: ");
        shepherd.setBounds(300, 180, 100, 20);
        pet.add(shepherd);

        shepherdTF = new JTextField();
        shepherdTF.setBounds(420, 180, 100, 20);
        pet.add(shepherdTF);

        JLabel holder = new JLabel("Owner: ");
        holder.setBounds(300, 220, 100, 20);
        pet.add(holder);

        holderTF = new JTextField();
        holderTF.setBounds(420, 220, 100, 20);
        pet.add(holderTF);

        JLabel date = new JLabel("Vaccination Date: ");
        date.setBounds(300, 260, 120, 20);
        pet.add(date);

        dateTF = new JTextField();
        dateTF.setBounds(420, 260, 100, 20);
        pet.add(dateTF);

        JButton click = new JButton("Add Dog");
        click.setBounds(350, 300, 120, 30);
        pet.add(click);
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDog();
            }
        });

        JLabel domestic = new JLabel("Pet Id:");
        domestic.setBounds(120, 400, 100, 20);
        pet.add(domestic);

         domesticTF = new JTextField();
        domesticTF.setBounds(200, 400, 100, 20);
        pet.add(domesticTF);

        JButton watch = new JButton("Display Info");
        watch.setBounds(60, 450, 120, 30);
        pet.add(watch);
        watch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display();
            }
        });

        JButton listen = new JButton("Make Sound");
        listen.setBounds(250, 450, 120, 30);
        pet.add(listen);

        JLabel extraPet = new JLabel("Pet Id: ");
        extraPet.setBounds(600, 160, 100, 20);
        pet.add(extraPet);

        extraPetTF = new JTextField();
        extraPetTF.setBounds(750, 160, 100, 20);
        pet.add(extraPetTF);

        JLabel Date1 = new JLabel("Vaccination Date: ");
        Date1.setBounds(600, 200, 200, 20);
        pet.add(Date1);

        newdateTF = new JTextField();
        newdateTF.setBounds(750, 200, 100, 20);
        pet.add(newdateTF);

        JButton enter = new JButton("Vaccinate Dog");
        enter.setBounds(730, 250, 120, 30);
        pet.add(enter);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vaccinateDog();
            }
        });

        pet.setVisible(true);

    }

    /**
     * Method to add a cat to the arraylist
     */
    private void addCat() {
        try {
            // 1. get all the necessary data from textfields
            // getTFText(JTextField tf) method helps to get text from passed textfields
            String petId = getTFText(meowTF);
            ;
            String petName = getTFText(nameTF);
            String petAge = getTFText(meowAgeTF);
            String owner = getTFText(detailTF);

            // convetToInt(String text) is used to convert text into int
            int intAge = convertToInt(petAge);

            if (isIDRepeated(petId)) {
                JOptionPane.showMessageDialog(pet, "Id already found.");
                return;
            }

            // 2. Create an objet of Cat
            Cat cat = new Cat(petId, petName, owner, intAge);

            // 3. add the object into an arraylist
            petList.add(cat);

            JOptionPane.showMessageDialog(pet, "Successfully added");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(pet, "Age must be in number", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(pet, "Fill all feilds", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addDog() {
        try {
            String petId = getTFText(bhauTF);
            String petName = getTFText(bhauNameTF);
            String breed = getTFText(shepherdTF);
            String owner = getTFText(holderTF);
            String vaccinationDate = getTFText(dateTF);
            if (isIDRepeated(petId)) {
                JOptionPane.showMessageDialog(pet, "Id is repeated!");
                return;
            }
            Dog dog = new Dog(petId, petName, owner, breed, vaccinationDate);
            petList.add(dog);
            JOptionPane.showMessageDialog(pet, "Successfully added!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(pet, "Fields are empty!");
        }

    }

    private void vaccinateDog(){

        try {
            String id = getTFText(extraPetTF);
            String vaccinationDate = getTFText(newdateTF);
            Animal animal = getPetById(id);
            if(animal == null){
                JOptionPane.showMessageDialog(pet,"No pet found!","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(!(animal instanceof Dog)){
                JOptionPane.showMessageDialog(pet,"This is not a dog. Cannot be vaccinated!","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
            Dog dog = (Dog)animal;
            dog.vaccinateDog(vaccinationDate);
            JOptionPane.showMessageDialog(pet,"Successfully Vaccinated!");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(pet,"Empty fields!","ERROR",JOptionPane.ERROR_MESSAGE);
        }




    }

    private String getTFText(JTextField tf) {
        String text = tf.getText().trim();
        if (text.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return text;
    }

    private int convertToInt(String text) {
        int intValue = Integer.parseInt(text);
        return intValue;
    }

    private boolean isIDRepeated(String id) {
        boolean isFound = false;
        for (Animal an : petList) {
            if (an.getPetId().equals(id)) {
                isFound = true;
                break;
            }
        }
        return isFound;

    }


    private boolean isIdRepeated(String id) {
        for (Animal animal : petList) {
            if (animal.getPetId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    private Animal getPetById(String id){
        for(Animal animal : petList){
            if(animal.getPetId().equals(id)){
                return animal;
            }
        }
        return null;
    }

    private void display(){
        try {
            String id = getTFText(domesticTF);
            Animal animal = getPetById(id);
            if(animal==null){
                JOptionPane.showMessageDialog(pet,"No pet registered");
                return;
            }
            animal.display();
            JOptionPane.showMessageDialog(pet,"Information are displayed in terminal");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(pet,"Empty fields!");
        }

    }



    public static void main(String[] args) {
        new PetRecordSystem();
    }
}