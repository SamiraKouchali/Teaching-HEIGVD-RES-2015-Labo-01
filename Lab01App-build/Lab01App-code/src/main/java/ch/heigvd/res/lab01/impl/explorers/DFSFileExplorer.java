package ch.heigvd.res.lab01.impl.explorers;

import ch.heigvd.res.lab01.interfaces.IFileExplorer;
import ch.heigvd.res.lab01.interfaces.IFileVisitor;
import java.io.File;
import java.util.LinkedList;

/**
 * This implementation of the IFileExplorer interface performs a depth-first
 * exploration of the file system and invokes the visitor for every encountered
 * node (file and directory). When the explorer reaches a directory, it visits
 * all files in the directory and then moves into the subdirectories.
 *
 * @author Olivier Liechti
 */
public class DFSFileExplorer implements IFileExplorer {

    @Override
    public void explore(File rootDirectory, IFileVisitor vistor) {
     
        vistor.visit(rootDirectory);
     
     if (rootDirectory.listFiles() == null)
         return;
     
     // visiter les fichiers
     LinkedList<File> List_directorie = new LinkedList<File>();
     for (File file : rootDirectory.listFiles()) {
         if (file.isDirectory())
             List_directorie.add(file);
         if(file.isFile())
            vistor.visit(file);
     }
         
     for (File directory : List_directorie)
         explore(directory, vistor);
    }
}