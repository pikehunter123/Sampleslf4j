/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleslf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author kononov446
 */
public class SampleSlf4j {
final static Logger logger = LoggerFactory.getLogger(SampleSlf4j.class);
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    
    
    logger.debug("de.bu.g me.ss.age");
    logger.info("info message");
    logger.warn("warn message");
    logger.error("error message");
  }

    
}
