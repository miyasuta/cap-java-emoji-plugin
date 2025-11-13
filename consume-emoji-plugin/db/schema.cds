namespace my.book;

entity Books {
  key ID    : UUID;
  @emoji                 // ← 絵文字付与の対象フィールド
  title     : String(200);
  author    : String(200);
}
