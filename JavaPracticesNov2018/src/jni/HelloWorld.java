package jni;
class HelloWorld {

/* 	first declare the native function that will be
	defined in our shared library */

    public native void displayHelloWorld();

/* 	next call the system Class to load that library in JVM/OS*/


    static {
        System.loadLibrary("hello");
    }

/*	finally call the library from JVM  */
    
    public static void main(String[] args) {
        new HelloWorld().displayHelloWorld();
    }
}


