# Configuration / コンフィグ設定

[English](#english) | [日本語](#日本語)

Configuration file path: `config/iss_ink_craft-common.toml`

Changes take effect on world load or after running `/reload` in-game.

---

## English

### `[recipes]`

| Key | Type | Default | Description |
| :--- | :--- | :--- | :--- |
| `enableBaseInkCrafting` | `Boolean` | `true` | Enables crafting table compression recipes for base Iron's Spells 'n Spellbooks inks (Uncommon, Rare, Epic, Legendary). |
| `enableForbiddenTiersCompat` | `Boolean` | `true` | Enables crafting table compression recipes for Forbidden Tiers inks (Mythic, Ancient). Only active when `forbidden_tiers` is installed. |
| `enableApotheosisCompat` | `Boolean` | `true` | Enables crafting table recipe to craft Common Ink from 1x `apotheosis:common_material` and 1x `minecraft:glass_bottle`. Only active when `apotheosis` is installed. |

---

## 日本語

設定ファイルパス: `config/iss_ink_craft-common.toml`

変更内容はワールド読み込み時、またはゲーム内で `/reload` コマンドを実行した際に反映されます。

### `[recipes]`

| キー名 | データ型 | デフォルト値 | 説明 |
| :--- | :--- | :--- | :--- |
| `enableBaseInkCrafting` | `Boolean` | `true` | Iron's Spells 'n Spellbooks の基本インク（Uncommon / Rare / Epic / Legendary）の作業台圧縮レシピを有効にします。 |
| `enableForbiddenTiersCompat` | `Boolean` | `true` | Forbidden Tiers のインク（Mythic / Ancient）の作業台圧縮レシピを有効にします。`forbidden_tiers` 導入時のみ有効になります。 |
| `enableApotheosisCompat` | `Boolean` | `true` | Apotheosis のコモン素材 1つとガラス瓶 1つからコモンインクを作成するレシピを有効にします。`apotheosis` 導入時のみ有効になります。 |
