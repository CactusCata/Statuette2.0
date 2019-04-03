package fr.cactuscata.statuette.api.one.test.http;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsEqual.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.cactuscata.statuette.api.one.main.http.HttpBody;

@RunWith(JUnit4.class)
public class HttpBodyTests {

    @Test
    public void getBytes_constructedWithString_returnsBytesOfString() {
        String s = "someString";
        HttpBody body = new HttpBody(s);
        byte[] expected = s.getBytes();

        byte[] actual = body.getBytes();

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void getBytes_constructedWithoutString_returnsEmptyByteArray() {
        HttpBody body = new HttpBody(null);
        byte[] expected = new byte[0];

        byte[] actual = body.getBytes();

        assertThat(actual, is(equalTo(expected)));
    }

}
