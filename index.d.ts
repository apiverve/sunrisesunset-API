declare module '@apiverve/sunrisesunset' {
  export interface sunrisesunsetOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface sunrisesunsetResponse {
    status: string;
    error: string | null;
    data: any;
    code?: number;
  }

  export default class sunrisesunsetWrapper {
    constructor(options: sunrisesunsetOptions);

    execute(callback: (error: any, data: sunrisesunsetResponse | null) => void): Promise<sunrisesunsetResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: sunrisesunsetResponse | null) => void): Promise<sunrisesunsetResponse>;
    execute(query?: Record<string, any>): Promise<sunrisesunsetResponse>;
  }
}
