/*
 * Copyright © 2020 IBM Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package dev.ebullient.dnd.beastiary.compendium;

import java.util.List;

import dev.ebullient.dnd.beastiary.Beast;

public class Attack implements Beast.Attack {

    public static class Damage implements Beast.Damage {
        String type;
        String amount;
        String savingThrow;
        List<Beast.Statistic> disadvantage;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getSavingThrow() {
            return savingThrow;
        }

        public void setSavingThrow(String savingThrow) {
            this.savingThrow = savingThrow;
        }

        public String toString() {
            return amount + type
                    + (savingThrow == null ? "" : ("[" + savingThrow + "]"));
        }

        public List<Beast.Statistic> getDisadvantage() {
            return disadvantage;
        }

        public void setDisadvantage(List<Beast.Statistic> disadvantage) {
            this.disadvantage = disadvantage;
        }
    }

    String name;
    boolean melee;
    int attackModifier;
    Damage damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public String toString() {
        return name + ":" + attackModifier + "hit|" + damage.toString().replaceAll("\\s+", "");
    }

    public boolean isMelee() {
        return melee;
    }

    public void setMelee(boolean melee) {
        this.melee = melee;
    }
}