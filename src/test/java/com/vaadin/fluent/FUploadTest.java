package com.vaadin.fluent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.fluent.ui.FUpload;
import com.vaadin.server.StreamVariable.StreamingProgressEvent;
import com.vaadin.ui.Upload.ChangeEvent;
import com.vaadin.ui.Upload.FailedEvent;
import com.vaadin.ui.Upload.FinishedEvent;
import com.vaadin.ui.Upload.SucceededEvent;

public class FUploadTest {

    @Test
    public void test() {
        FUpload upload = new FUpload().withButtonCaption("file")
                                      .withImmediateMode(false)
                                      .withFailedListener(event -> System.out.println("failed"))
                                      .withFinishedListener(event -> System.out.println("finished"))
                                      .withChangeListener(event -> System.out.println("changed"))
                                      .withSucceededListener(event -> System.out.println("succeeded"))
                                      .withProgressListener((readBytes, contentLength) -> System.out.println("progress"));

        assertEquals("file", upload.getButtonCaption());
        assertFalse(upload.isImmediateMode());
        assertEquals(1, upload.getListeners(FailedEvent.class).size());
        assertTrue(upload.getListeners(FinishedEvent.class).size() > 0);
        assertEquals(1, upload.getListeners(ChangeEvent.class).size());
        assertEquals(1, upload.getListeners(SucceededEvent.class).size());
        assertEquals(1, upload.getListeners(StreamingProgressEvent.class).size());
    }

}
