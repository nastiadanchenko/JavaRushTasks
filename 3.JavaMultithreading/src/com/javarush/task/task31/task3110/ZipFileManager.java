package com.javarush.task.task31.task3110;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by User on 09.09.2020.
 */
public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) {
        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zipFile));
             InputStream ips = Files.newInputStream(source)) {

            ZipEntry zE = new ZipEntry( source.getFileName().toString());
            zos.putNextEntry(zE);       // добавить каждый объект ZipEntry в архив
            byte[] buffer = new byte[ips.available()];
            ips.read(buffer);
            zos.write(buffer);        // добавляем содержимое к архиву
            zos.closeEntry();         // закрываем текущую запись для новой записи

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
