 class bikeBlueprintClass {
    int gear;
    public void increase(){
        System.out.println("Bike gear increased");
        gear++;
    }
}

class bike{
    public static void main(String[] args){
        bikeBlueprintClass r15Bike = new bikeBlueprintClass();
        r15Bike.increase();
    }   
}
