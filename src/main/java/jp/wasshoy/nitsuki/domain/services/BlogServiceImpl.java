package jp.wasshoy.nitsuki.domain.services;

import jp.wasshoy.nitsuki.domain.models.Entry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Override
    public List<Entry> findAllEntries(int page, int size) {
        // TODO: 全件取得（パラメーター無視）
        // TODO: ページネーション
        // TODO: 取得サイズ指定
        return null;
    }

    @Override
    public Entry createEntry(Entry entry) {
        // TODO: エントリー作成
        return null;
    }

    @Override
    public Entry getEntry(int id) {
        // TODO: エントリー1件取得
        return null;
    }

    @Override
    public Entry updateEntry(Entry entry) {
        // TODO: エントリー更新
        return null;
    }

    @Override
    public void deleteEntry(int id) {
        // TODO: エントリー削除
    }
}
