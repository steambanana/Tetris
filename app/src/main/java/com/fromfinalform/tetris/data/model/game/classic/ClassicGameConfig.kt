/*
 * Created by S.Dobranos on 19.11.20 16:09
 * Copyright (c) 2020. All rights reserved.
 */

package com.fromfinalform.tetris.data.model.game.classic

import com.fromfinalform.tetris.domain.model.game.IGameConfig
import javax.inject.Inject

class ClassicGameConfig : IGameConfig {

    override val cellSizePx get() = 108f
    override val cellTextureContentGapHPx get() = 3f//11f
    override val cellTextureContentGapVPx get() = 3f//11f

    override val hardDropSpeed get() = 1f/10
    override val softDropSpeed get() = 1f/100

    override val fieldWidth get() = 10
    override val fieldHeight get() = 22//40

    override val completeRowsToNextLevel get() = 10

    override val waitForUserBeforeHoldMs get() = 200

    override val fieldWidthPx get() = cellSizePx * fieldWidth
    override val fieldHeightPx get() = cellSizePx * fieldHeight

    @Inject constructor() {

    }
}