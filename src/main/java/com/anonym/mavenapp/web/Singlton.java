package com.anonym.mavenapp.web;

/**
 * Author:Anonym
 * 2020/3/25
 */
public class Singlton {

    private static int num=0;
    private int lou;
    private int temp;
    public void index(){
        for(lou = 1;lou<=50;lou++){
            ++num;
            if(lou == 50){
                System.out.println(temp);
                break;
            }else{

                if(num%5==0){
                    num-=3;
                    ++temp;
                    System.out.println("num="+num);
                }
            }

        }

    }

    public static void main(String[] args) {
        Singlton s = new Singlton();
        s.index();
    }
}
