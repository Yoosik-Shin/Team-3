package Day06.Review;


	class Parent {
		Parent() {
			System.out.println("Prarent 1");
		}
		Parent(String str) {
			System.out.println("Parent 2");
		}
	}
	
	class Child extends Parent {
		Child() {
			System.out.println("Child 1");
		}
		Child(String str) {
			System.out.println("Child 2");
		}
	}


