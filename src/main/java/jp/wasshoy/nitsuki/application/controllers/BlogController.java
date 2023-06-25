package jp.wasshoy.nitsuki.application.controllers;

import java.util.List;

import jp.wasshoy.nitsuki.domain.models.Entry;
import jp.wasshoy.nitsuki.domain.services.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/entries")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }

    @GetMapping("/")
    public ResponseEntity<List<Entry>> getEntries(
            @RequestParam Integer page, @RequestParam Integer size) {
        // TODO: ページネーションと取得サイズを制限
        return ResponseEntity.ok(blogService.findAllEntries(page, size));
    }

    @PostMapping("/")
    public ResponseEntity<Entry> postEntries(@RequestParam Entry entry) {
        final var createdEntry = blogService.createEntry(entry);
        // TODO: 作成できなかった場合 200 OK を返す
        // TODO: 作成したリソースへのリンクを Location ヘッダに含める
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEntry);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entry> getEntry(@PathVariable Integer id) {
        // TODO: 返り値がnullの場合の挙動を考える
        return ResponseEntity.ok(blogService.getEntry(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity updateEntry(@PathVariable Integer id, @RequestParam Entry entry) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEntry(@PathVariable Integer id, @RequestParam Entry entry) {
        // TODO:
        //  削除成功：return 204 No Content
        return null;
    }

    // TODO: 例外処理の ControllerAdvice class を作成
}
