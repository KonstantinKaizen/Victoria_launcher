import javafx.scene.shape.Path;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Utility {

    public static void copyFile_2(File sourceFile, File destinationFile)
            throws IOException {
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buf = new byte[1024];
            int length;
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
        }
    }



    public static void copyFile(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    } // копирование файла


    public static void copyDirectory(File sourceDirectory, File destinationDirectory) throws IOException {
        if (!destinationDirectory.exists()) {
            destinationDirectory.mkdir();
        }
        for (String f : sourceDirectory.list()) {
            copyDirectoryCompatibityMode(new File(sourceDirectory, f), new File(destinationDirectory, f));
        }
    }
    public static void copyDirectoryCompatibityMode(File source, File destination) throws IOException {
        if (source.isDirectory()) {
            copyDirectory(source, destination);
        } else {
            copyFile_2(source, destination);
        }
    }



    public static void deleteDirectory(File directory) {

        // if the file is directory or not
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            // if the directory contains any file
            if (files != null) {
                for (File file : files) {

                    // recursive call if the subdirectory is non-empty
                    deleteDirectory(file);
                }
            }
        }
        directory.delete();
    } // удалить дерикторию рекурсивно


    public static void download(String urlStr, String file) throws IOException {
        System.out.println("download started");
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
        System.out.println("download compeleted");
    } // скачать

    public static void extractFolder(String zipFile,String extractFolder) // разархивировать
    {

        System.out.println("extraction started");
        try
        {
            int BUFFER = 2048;
            File file = new File(zipFile);

            ZipFile zip = new ZipFile(file);
            String newPath = extractFolder;

            new File(newPath).mkdir();
            Enumeration zipFileEntries = zip.entries();

            // Process each entry
            while (zipFileEntries.hasMoreElements())
            {
                // grab a zip file entry
                ZipEntry entry = (ZipEntry) zipFileEntries.nextElement();
                String currentEntry = entry.getName();

                File destFile = new File(newPath, currentEntry);
                //destFile = new File(newPath, destFile.getName());
                File destinationParent = destFile.getParentFile();

                // create the parent directory structure if needed
                destinationParent.mkdirs();

                if (!entry.isDirectory())
                {
                    BufferedInputStream is = new BufferedInputStream(zip
                            .getInputStream(entry));
                    int currentByte;
                    // establish buffer for writing file
                    byte data[] = new byte[BUFFER];

                    // write the current file to disk
                    FileOutputStream fos = new FileOutputStream(destFile);
                    BufferedOutputStream dest = new BufferedOutputStream(fos,
                            BUFFER);

                    // read and write until last byte is encountered
                    while ((currentByte = is.read(data, 0, BUFFER)) != -1) {
                        dest.write(data, 0, currentByte);
                    }
                    dest.flush();
                    dest.close();
                    is.close();

                }


            }


            zip.close();

        }
        catch (Exception e)
        {
            throw new RuntimeException(e);

        }
        System.out.println("extraction ended");

    }

    public static void modifyPath(String str, String filename) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        char c = '\\';

        for (int i = 0; i < str.length(); i++) {
            writer.write(str.charAt(i));
            if (str.charAt(i) == c){
                writer.write(c);
            }

        }

        writer.close();
    } // добавить дополнительный слеш в String

    public static void vic_3_giga_try(){
        try {
            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\console_history.txt"));




        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\content_load.json"));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } finally {
                try {
                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\dlc_signature"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } finally {
                    try {
                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\game_data.json"));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }finally {
                        try {
                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\launcher-v2.sqlite"));
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }finally {
                            try {
                                Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\pdx_settings.json"));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            } finally {
                                try {
                                    Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\pops_filestorage.index"));
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                } finally {
                                    try {
                                        Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\tutorial.txt"));
                                    } catch (IOException ex) {
                                        throw new RuntimeException(ex);
                                    } finally {
                                        try {
                                            Files.delete(Paths.get(new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Paradox Interactive\\Victoria 3\\continue_game.json"));
                                        } catch (IOException ex) {
                                            throw new RuntimeException(ex);
                                        }



                                    }

                                }

                            }

                        }

                    }

                }

            }

        }
    }

    public static String readFile(InputStream inputStream) throws IOException {
        String result;
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            result = br.readLine();

        }
        return result;
    } // прочитать файл

    public static void deleteDir(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (! Files.isSymbolicLink(f.toPath())) {
                    deleteDir(f);
                }
            }
        }
        file.delete();
    } // удалить дерикторию


    public static void dwnldFile(String url,String output){

        System.out.println("123");



        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(output)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (Exception e) {

            System.out.println("exc");
        }



    }

    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }

    public static long getUrlSize(String s){



        try {
            URL url = new URL(s);
            URLConnection conn = url.openConnection();
            conn.connect();
            return conn.getHeaderFieldLong("Content-Length",-1);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
























}
