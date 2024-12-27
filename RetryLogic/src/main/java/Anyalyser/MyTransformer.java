package Anyalyser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class MyTransformer implements IAnnotationTransformer{

	
	public void transform(ITestAnnotation annotaion,Class testClass, Constructor testConstructor, Method Test)
	{
		annotaion.setRetryAnalyzer(RetryAnalyser.class);
	
	}
}
