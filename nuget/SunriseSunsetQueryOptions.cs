using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.SunriseSunset
{
    /// <summary>
    /// Query options for the Sunrise Sunset API
    /// </summary>
    public class SunriseSunsetQueryOptions
    {
        /// <summary>
        /// The latitude of the location for which you want to get the sunrise and sunset times (e.g., 36.7201600)
        /// Example: 36.7201600
        /// </summary>
        [JsonProperty("lat")]
        public string Lat { get; set; }

        /// <summary>
        /// The longitude of the location for which you want to get the sunrise and sunset times (e.g., -4.4203400)
        /// Example: -4.4203400
        /// </summary>
        [JsonProperty("lon")]
        public string Lon { get; set; }

        /// <summary>
        /// The date for which you want to get the sunrise and sunset times (e.g., MM-DD-YYYY : 01-01-2022)
        /// Example: 12-02-2025
        /// </summary>
        [JsonProperty("date")]
        public string Date { get; set; }
    }
}
