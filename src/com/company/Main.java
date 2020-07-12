package com.company;

public class Main {
    int age;
    String name;
    char cb;

    public static void main(String[] args) {
        Main learn=new Main();
        System.out.println("thak you for your participation");
        Main lear=new Main(27," ahmed");

        System.out.println(" amazigh");
        Main lea=new Main(34,"Abes",'A');
        lea.age=27;
        lea.name="Abe";
        lea.cb='b';
        System.out.println(lea.age+ " years old " +lea.name+" Abes "+lea.cb+ " final grade");



    }public Main(){
        System.out.println("first project");
    }public Main(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(this.age+" years old "+this.name+ " imesdourar");


    }public Main(int age,String name,char cb) {
        this.age = age;
        this.name = name;
        this.cb = cb;
        System.out.println(this.age + " " + this.name + " " + this.cb);
    }
    }

