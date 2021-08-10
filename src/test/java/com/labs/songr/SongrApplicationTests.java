package com.labs.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test void testAlbum(){
		Album NightVisions=new Album("Night Visions");
		NightVisions.setArtist("Imagine Dragons");
		assertEquals("Imagine Dragons",NightVisions.getArtist());
		NightVisions.setImageUrl("random.com");
		assertEquals("random.com",NightVisions.getImageUrl());
		NightVisions.setSongCount(15);
		assertEquals(15,NightVisions.getSongCount());
		NightVisions.setLength(50.20);
		assertEquals(50.20,NightVisions.getLength());


	}

}
