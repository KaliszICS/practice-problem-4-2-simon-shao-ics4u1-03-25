/** 
    * A object that contains informations of a car
    * @author Simon Shao
    * @version 1.0.0
    */

    public class Car{

        //instance var
        private String make;
        private String model;
        private int year;
        private int price;
        
        
        /**
         * Constructor to initialize all instance variables;
         * @param make String variable for the car manufactorer
         * @param model String variable for the car model
         * @param year integer variable for the year of car
         * @param price integer variable for the car price
         */
        public Car(String make, String model, int year, int price){
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }
        
        /**
         * Getter for the manufactorer of the car
         * @return returns the maker
         */
        public String getMake(){
            return this.make;
        }
        
        /**
         * Getter for the model of car
         * @return returns the model
         */
        public String getModel(){
            return this.model;
        }
        
        /**
         * Getter for the year of the car
         * @return returns the year
         */
        public double getYear(){
            return this.year;
        }

        /**
         * Getter for the price of the car
         * @return returns the price
         */
        public double getPrice(){
            return this.price;
        }
        
        /**
         * Sets the maker of car to the provided value
         * @param make String that will replace the value of maker
         */
        public void setMake(String make){
            this.make = make;
        }
        
        /**
         * Sets the model of car to the provided value
         * @param model String that will replace the model variable
         */
        public void setModel(String model){
            this.model = model;
        }
        
        /**
         * Sets the year of car to the provided value
         * @param year int that will replace the value of year
         */
        public void setYear(int year){
            this.year = year;
        }


        /**
         * Sets the year of car to the provided value
         * @param price int that will replace the value of year
         */
        public void setPrice(int price){
            this.price = price;
        }
        
        }
        
        