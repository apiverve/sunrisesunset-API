declare module '@apiverve/sunrisesunset' {
  export interface sunrisesunsetOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface sunrisesunsetResponse {
    status: string;
    error: string | null;
    data: SunriseSunsetData;
    code?: number;
  }


  interface SunriseSunsetData {
      solarNoon:     Date;
      sunrise:       Date;
      sunset:        Date;
      sunriseEnd:    Date;
      sunsetStart:   Date;
      dawn:          Date;
      dusk:          Date;
      nauticalDawn:  Date;
      nauticalDusk:  Date;
      nightEnd:      Date;
      night:         Date;
      goldenHourEnd: Date;
      goldenHour:    Date;
  }

  export default class sunrisesunsetWrapper {
    constructor(options: sunrisesunsetOptions);

    execute(callback: (error: any, data: sunrisesunsetResponse | null) => void): Promise<sunrisesunsetResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: sunrisesunsetResponse | null) => void): Promise<sunrisesunsetResponse>;
    execute(query?: Record<string, any>): Promise<sunrisesunsetResponse>;
  }
}
