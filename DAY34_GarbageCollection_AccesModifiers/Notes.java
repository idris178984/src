package DAY34_GarbageCollection_AccesModifiers;

public class Notes {
    /*
    1. Static Continue:
				static block
				static import

		2. Garbage Collection
		3. Access Modifiers: public, private, default


package name: day34_GarbageCollection_AccessModifiers


static block: used for initializing static variables
			  gets executed as son as the class is loaded
			  runs first before everything, only runs one time

			  if the static variables need several steps to be initialized



Constructors short quiz due by 11:45 am


static import vs regular import

		regular import: imports everything from the class
			import packageName.className;
			import packageName.*;


		static import:

			import static packageName.className.staticMember;  // imports one static member of a class
			import static packageName.className.*;			 // imports all static members of a class


Garbage Collection: Collection of unreferenced objects

		unreferenced objects:
			1. null keyword:
					String str = "Java";
					str = null;


			2. creating a new object

					String str = "Java";
					str = "Python";


Garbage Collector: responsible for collecting the unreferenced objects from java heap. and destroys it ( finalize())



Access Modifiers: define the accessibility

		public > protected > default > private

	private: ONLY reachable within the same class

	default: ONLY reachable within the same package

	public: ALWAYS rechable





     */
}
