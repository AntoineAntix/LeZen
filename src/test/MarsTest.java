package com.esiea.tp4A;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import com.esiea.tp4A.Mars;

public class MarsTest{

    Mars tMars = new Mars();

    @Test
    void obstacles() {
        System.out.println("début");
        mars.genererObstacles();
        //assertThat(mars.obstaclePositions().size()==15);
        System.out.println("fin");
    }
}