/** 
    * this is an object that represents a dog, with only name, breed, and weight. 
    * @author Simon Shao
    * @version 1.0.0
    */

public class Dog{

//instance var
private String name;
private String breed;
private int weight;


/**
 * initialize dog name, breed, weight to given arguments;
 * @param name String variable for the name of the dog
 * @param breed String variable for the breed of the dog
 * @param weight int variable for the weight of the dog
 */
public Dog(String name, String breed, int weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}

/**
 * Gets the name of the dog
 * @return returns the name of the dog
 */
public String getName(){
    return this.name;
}

/**
 * Gets the breed of the dog
 * @return returns the breed of the dog
 */
public String getBreed(){
    return this.breed;
}

/**
 * Gets the weight of the dog
 * @return returns the weight of the dog
 */
public int getWeight(){
    return this.weight;
}

/**
 * Sets the name of the dog to the provided value
 * @param name String that will replace the value of name
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
 * @param weight integer that will replace the value of weight
 */
public void setWeight(int weight){
    this.weight = weight;
}

}

