
public class MBT {

	public static void main(String[] args) {
		 Bird bird = new Bird();
		 bird.walk();
		 bird.fly();
		 bird.sing();
		 
		 System.out.println("*******");
		 Duck duck = new Duck();
		 duck.fly();
		 duck.sing();
		 duck.swim();
		 System.out.println("*******");
		 Chicken chicken = new Chicken();
		 
		 chicken.sing();
		 System.out.println("*******");
		 
		 Rooster rooster = new  Rooster();
		 rooster.sing();
		 
		 Parrot parrot = new Parrot();
		 
		 int fly=0;
		 
		 Animal[] animals = new Animal[]{
				 new Bird(),
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(),
//				 new Fish(),
//				 new Shark(),
//				 new Clownfish(),
//				 new Dolhpin (),
//				 new Frog (),
//				 new Dog(),
//				 new Butterfly (),
//				 new Cat()
				 };
				  for(Animal animal : animals) {
					  if(animal instanceof FlybleBird) {
						fly++;
					  }
				  }
				  
				  System.out.println("******* "+fly);
	}

}


class Animal {
	void walk(){
		System.out.println("I am walking");
	}
}


interface SingingBird{
	public void sing();
}

interface FlybleBird{
	public void fly();
}

interface SwimmingBird{
	public void swim();
}


// ********************

class Bird extends Animal implements SingingBird, FlybleBird   {

	@Override
	public void sing() {
		System.out.println(" ....");
		 
	}
	@Override
	public void fly() {	 
		System.out.println("I Can fly ");
	}
}

class Duck extends Bird implements SwimmingBird {
	
	public void sing() {
		System.out.println("Quack , quack");
	}

	@Override
	public void swim() {
		System.out.println("I can Swim ");
		
	}
	
	
}

class Chicken extends Animal implements SingingBird  {
	
	public void sing() {
		System.out.println("Cluck, cluck");  
	}
	
	 
}


class Rooster extends Chicken  {
	public void sing() {
		System.out.println("Cock-a-doodle-doo");  
	}
}


class Parrot extends Bird  {
	
	private SingingBird singingBird;
	
	 
	public SingingBird getSingingBird() {
		return singingBird;
	}
 
	public void setSingingBird(SingingBird singingBird) {
		this.singingBird = singingBird;
	}





	public void sing() {
		 this.getSingingBird().sing();
	}
}

 
