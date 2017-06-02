
public class Car extends Vehicle{
    
   protected int noOfDoors;
   protected String colors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

   @Override
    public String getBrandName() {
        return brandName;
    }

   @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    
    @Override
    public String validateBrandName() {
        String hi = "5";
       System.out.println("Hiiii"+hi);
       return hi;
    }
   
   
}
