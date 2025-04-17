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
        public Dog(String make, String model, int year, int price){
            this.name = name;
            this.breed = breed;
            this.weight = weight;
        }
        
        /**
         * Getter for the name of the dog
         * @return returns the name of the dog
         */
        public String getName(){
            return this.name;
        }
        
        /**
         * Getter for the breed of the dog
         * @return returns the breed of the dog
         */
        public String getBreed(){
            return this.breed;
        }
        
        /**
         * Getter for the weight of the dog
         * @return returns the weight of the dog
         */
        public double getWeight(){
            return this.weight;
        }
        
        /**
         * Sets the name of the dog to the provided value
         * @param breed String that will replace the value of name
         */
        public void setName(String name){
            this.name = name;
        }
        
        /**
         * Sets the breed of the dog to the provided value
         * @param breed String that will replace the value of breed
         */
        public void setBreed(String breed){
            this.breed = breed;
        }
        
        /**
         * Sets the weight of the dog to the provided value
         * @param weight dobule that will replace the value of weight
         */
        public void setWeight(double weight){
            this.weight = weight;
        }
        
        }
        
        