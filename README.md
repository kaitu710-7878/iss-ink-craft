# ISS Ink Craft

[English](#english) | [日本語](#日本語)

---

## English

**ISS Ink Craft** is a lightweight Minecraft Forge 1.20.1 mod that adds crafting table (shapeless) recipes to upgrade **Iron's Spells 'n Spellbooks** inks using the exact same material costs as the Alchemist Cauldron. It also provides optional integrations for **Forbidden Tiers** and **Apotheosis**.

### Features

1. **Base Ink Compression (Iron's Spells 'n Spellbooks)**
   - **Uncommon Ink**: 4x Common Ink + 1x Copper Ingot (`#forge:ingots/copper`)
   - **Rare Ink**: 4x Uncommon Ink + 1x Iron Ingot (`#forge:ingots/iron`)
   - **Epic Ink**: 4x Rare Ink + 1x Gold Ingot (`#forge:ingots/gold`)
   - **Legendary Ink**: 4x Epic Ink + 1x Amethyst Shard (`#forge:gems/amethyst`)

2. **Forbidden Tiers Integration (Optional)**
   - Automatically enabled when `forbidden_tiers` is installed:
   - **Mythic Ink**: 4x Legendary Ink + 1x Netherite Scrap (`minecraft:netherite_scrap`)
   - **Ancient Ink**: 4x Mythic Ink + 1x Mithril Scrap (`irons_spellbooks:mithril_scrap`)

3. **Apotheosis Integration (Optional)**
   - Automatically enabled when `apotheosis` is installed:
   - **Common Ink**: 1x Common Material (`apotheosis:common_material`) + 1x Glass Bottle (`minecraft:glass_bottle`)

4. **Configurable Recipes**
   - Each recipe group can be individually toggled in `config/iss_ink_craft-common.toml`. See [CONFIG.md](CONFIG.md) for details.

### Installation

1. Install **Minecraft 1.20.1** and **Minecraft Forge** (`47.x` or later).
2. Install **Iron's Spells 'n Spellbooks** (required).
3. Optionally install **Forbidden Tiers** and/or **Apotheosis**.
4. Place `iss_ink_craft-1.0.0-release.jar` into your `mods` folder.

### License

This mod is licensed under a dual-license model: **GNU General Public License v3.0 or later (GPL-3.0-or-later)**, or **MIT**, or **LGPL-2.1-or-later** to maintain compatibility with integrated mods (Apotheosis: MIT, Forbidden Tiers: LGPL-2.1-or-later). See [LICENSE](LICENSE), [LICENSE-GPL-3.0](LICENSE-GPL-3.0), [LICENSE-MIT](LICENSE-MIT), and [LICENSE-LGPL-2.1](LICENSE-LGPL-2.1) for the full texts.

---

## 日本語

**ISS Ink Craft** は、**Iron's Spells 'n Spellbooks** のインクを醸造釜（Alchemist Cauldron）での圧縮と同じ素材消費で作業台（不定形レシピ）からクラフトできるようにする Minecraft 1.20.1 Forge 向け軽量MODです。**Forbidden Tiers** および **Apotheosis** とのオプション連携にも対応しています。

### 特徴

1. **基本インクの作業台圧縮 (Iron's Spells 'n Spellbooks)**
   - **アンコモンインク (Uncommon Ink)**: コモンインク ×4 + 銅インゴット ×1 (`#forge:ingots/copper`)
   - **レアインク (Rare Ink)**: アンコモンインク ×4 + 鉄インゴット ×1 (`#forge:ingots/iron`)
   - **エピックインク (Epic Ink)**: レアインク ×4 + 金インゴット ×1 (`#forge:ingots/gold`)
   - **レジェンダリーインク (Legendary Ink)**: エピックインク ×4 + アメジストの欠片 ×1 (`#forge:gems/amethyst`)

2. **Forbidden Tiers オプション連携**
   - `forbidden_tiers` が導入されている場合に自動で有効化されます：
   - **ミシックインク (Mythic Ink)**: レジェンダリーインク ×4 + ネザライトの欠片 ×1 (`minecraft:netherite_scrap`)
   - **エンシェントインク (Ancient Ink)**: ミシックインク ×4 + ミスリルの欠片 ×1 (`irons_spellbooks:mithril_scrap`)

3. **Apotheosis オプション連携**
   - `apotheosis` が導入されている場合に自動で有効化されます：
   - **コモンインク (Common Ink)**: コモン素材 (`apotheosis:common_material`) ×1 + ガラス瓶 (`minecraft:glass_bottle`) ×1

4. **コンフィグによる個別切り替え**
   - `config/iss_ink_craft-common.toml` から各レシピグループの有効/無効を切り替えられます。詳細は [CONFIG.md](CONFIG.md) をご覧ください。

### 導入手順

1. **Minecraft 1.20.1** および **Minecraft Forge**（`47.x` 以降）を導入します。
2. **Iron's Spells 'n Spellbooks**（必須）を導入します。
3. 必要に応じて **Forbidden Tiers** や **Apotheosis** を導入します。
4. `iss_ink_craft-1.0.0-release.jar` を `mods` フォルダに配置します。

### ライセンス

本MODは、連携対象MOD（Apotheosis: MIT、Forbidden Tiers: LGPL-2.1-or-later）との整合性を保つため、**GPL-3.0-or-later / MIT / LGPL-2.1-or-later** のデュアルライセンス構成で提供されています。各ライセンスの全文は [LICENSE](LICENSE)、[LICENSE-GPL-3.0](LICENSE-GPL-3.0)、[LICENSE-MIT](LICENSE-MIT)、[LICENSE-LGPL-2.1](LICENSE-LGPL-2.1) を参照してください。
