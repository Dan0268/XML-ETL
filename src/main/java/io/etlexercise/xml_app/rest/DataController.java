package io.etlexercise.xml_app.rest;

import io.etlexercise.xml_app.model.DataDTO;
import io.etlexercise.xml_app.service.DataService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/xMLFiles", produces = MediaType.APPLICATION_JSON_VALUE)
public class DataController {

    private final DataService dataService;

    public DataController(final DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public ResponseEntity<List<DataDTO>> getAllData() {
        return ResponseEntity.ok(dataService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataDTO> getData(@PathVariable final Integer id) {
        return ResponseEntity.ok(dataService.get(id));
    }

    @PostMapping
    public ResponseEntity<Integer> createData(@RequestBody @Valid final DataDTO xMLFileDTO) {
        return new ResponseEntity<>(dataService.create(xMLFileDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateData(@PathVariable final Integer id, @RequestBody @Valid final DataDTO dataDTO) {
        dataService.update(id, dataDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteData(@PathVariable final Integer id) {
        dataService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
