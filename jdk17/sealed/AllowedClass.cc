#include "AllowedClass.h"

JNIEXPORT jobject JNICALL Java_AllowedClass_asSealedInst (JNIEnv * env, jobject obj) {
	return obj;
}
