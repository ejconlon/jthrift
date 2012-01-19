package jthrift.jparser;

import java.util.*;

public class TestRunner implements Runnable {

    private List<Runnable> tests = new LinkedList<Runnable>();

    public TestRunner() {}

    public void add(Runnable test) {
	tests.add(test);
    }

    @Override
    public void run() {
	for (Runnable test : tests) {
	    test.run();
	}
    }

    public static void main(String[] args) {
	TestRunner runner = new TestRunner();
	runner.add(new ParseTest());
	runner.run();
    }

}