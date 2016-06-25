package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class TempFolderRule {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {
        System.out.println("Creating a simple file in a temp folder");
        File testFile = tempFolder.newFile("testfile.txt");
        System.out.println(testFile.getAbsolutePath());
        System.out.println("Creating a simple folder in a temp folder");
        File testfolder = tempFolder.newFolder("testfolder");
        System.out.println("Deleting temp folder..No need to delete explicitly");
        tempFolder.delete();
    }

    @Test
    public void testAnotherTempFolder() throws IOException {
        System.out.println("Creating a other file in a temp folder");
        File testFile = tempFolder.newFile("otherTestfile.txt");
        System.out.println(testFile.getAbsolutePath());
    }
}
