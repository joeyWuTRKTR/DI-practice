# Dependency Injection
是一種低耦合、可維護性高的設計模式。透過抽象化物件，實現Solid的里氏替換及開放封閉原則。

### Dependency 高、低接模組（物件）彼此間的關係
### Injection 透過抽出一層介面，高階模組參照、低階模組實作

## DI如何解除依賴關係？
將物件抽出一層介面，各自依照介面實作，高階模組只需呼叫介面的方法即可！
將所有網頁的特質抽出來（打開網頁），實作打開網頁的功能（直接打開、年齡驗證）

## 里氏替換(Liskov Substitution Principle)：
瀏覽器只認網頁，瀏覽器可以替換不同網頁

## 開放封閉原則(Open-closed Principle)：
網頁的設計，是可以擴充的（加上年齡驗證）

## 依賴倒轉原則(DIP: Dependency Inversion Principle)：
解除高階模組和低階模組的依賴關係
由高階低階彼此的依賴關係，改為高階和低階都依賴共同介面
高階模組 browser 參照介面、低階模組 normal web & adult web 實作介面