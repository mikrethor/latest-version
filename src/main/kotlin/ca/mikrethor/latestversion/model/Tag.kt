package ca.mikrethor.latestversion.model

data class Tag(val name: String,
               val zipball_url: String? = null,
               val tarball_url:String?=null,
               val commit: Commit?=null,
               val node_id:String?=null)