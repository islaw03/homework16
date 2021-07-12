package com.company;

public class Dog extends Animal {
    boolean isFamale;
    boolean isPappyDog;

    public boolean isFamale() {
        return isFamale;

    }

    public void setFamale(boolean famale) {
        isFamale = famale;

    }

    public boolean isPappyDog (){
        return isPappyDog;

    }
    public void setPappyDog(boolean pappyDog){
        isPappyDog = pappyDog;
    }
}
