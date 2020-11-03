package com.example.springfpl;

import com.example.springfpl.models.FplStats;
import com.example.springfpl.services.FplDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class FplDataServiceTest {


    private FplDataService fplDataService = new FplDataService();

    @Test
    public void allData() {
        final List<FplStats> allStats = fplDataService.getAllStats();
        assertThat(allStats).isEmpty();
    }
}
