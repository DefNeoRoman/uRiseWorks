package binarySortedStorage;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class SortingTask implements Callable<List<Room>> {
    private Floor floor;

    public SortingTask(Floor floor) {
        this.floor = floor;
    }

    public List<Room> call() throws Exception {
        return null;
    }
}
