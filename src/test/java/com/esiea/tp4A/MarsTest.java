package com.esiea.tp4A;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import com.esiea.tp4A.*;

public class MarsTest{

    Mars tMars = new Mars();

    @Test
    void obstacles() {
        System.out.println("début");
        tMars.genererObstacles();
        //assertThat(tMars.obstaclePositions().size()==15);
        System.out.println("fin");
    }
}