/*
 * A trivial Java application that displays the reported memroy size, 
 *   and maximum and minimum heap size. 
 * Copyright (C)2024 Kevin Boone, GPLv3.0
 */
package net.kevinboone.apacheintegration.java_docker_test;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.MemoryMXBean;
import java.lang.management.ManagementFactory;

public class App
  {
  public static void main (String[] args) throws Exception
    {
    OperatingSystemMXBean osBean = 
      (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
    MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
    System.out.println ("Native memory size: " 
       + formatSize (osBean.getTotalPhysicalMemorySize()));
    System.out.println("Max heap size (Xmx): " 
       + formatSize (memoryBean.getHeapMemoryUsage().getMax()));
    System.out.println("Init heap size (Xms): " 
      + formatSize (memoryBean.getHeapMemoryUsage().getInit()));
    while (true) { Thread.sleep (1000); } 
    }

  public static String formatSize(long v) 
    {
    if (v < 1024) return v + " B";
    int z = (63 - Long.numberOfLeadingZeros(v)) / 10;
    return String.format("%.1f %sB", (double)v / (1L << (z*10)), " KMGTPE".charAt(z));
    }
  }

