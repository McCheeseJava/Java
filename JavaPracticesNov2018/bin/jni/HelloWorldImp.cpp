#include <jni.h>
#include "HelloWorld.h"
#include <iostream.h>

JNIEXPORT void JNICALL 
Java_HelloWorld_displayHelloWorld(JNIEnv *env, jobject obj) 
{
    cout << "Hello world!\n";
    return;
}

