const express = require('express');
const router = express();

const exerciesController = require("../controllers/exercises")

router.post("/exercises/exe1", exerciesController.exe1)
router.post("/exercises/exe2", exerciesController.exe2)
router.post("/exercises/exe3", exerciesController.exe3)
router.post("/exercises/exe4", exerciesController.exe4)
router.post("/exercises/exe5", exerciesController.exe5)
router.post("/exercises/exe6", exerciesController.exe6)
router.post("/exercises/exe17", exerciesController.exe17)



module.exports = router;